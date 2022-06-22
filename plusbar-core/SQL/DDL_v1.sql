-- drop table

drop table  tb_channel ;
drop table  tb_game;
drop table  tb_course;
drop table  tb_schedule;
drop table  tb_player;
drop table  tb_ranking;
drop table  tb_scoreboard;
drop table  tb_team ;
drop table  tb_tee_schedule ;
drop table  tb_team_player;
drop table  tb_sponsor;
drop table  tb_event;
DROP TABLE tb_provider;
DROP TABLE tb_vod_info;



-- tb_channel definition ---------------------------------------------------------------

--create table

create table tb_channel (
	channel_id 					varchar2(32) 					NOT NULL, 
	channel_name				varchar2(256)						NULL,
	refresh_rate				number(3,0)		DEFAULT 3 		NOT NULL,
	unable_menu_list			varchar2(256)						NULL,
	home_button_use				number(1,0)		DEFAULT 1 		NOT NULL,
	home_delay_time				number(3,0)		DEFAULT 10 		NOT NULL,
	app_version 				varchar2(64)						NULL,
	show						number(1,0)		DEFAULT 1  		NOT NULL,
	constraint tb_channel_pk primary key (channel_id)
);

comment on table tb_channel is '채널정보 테이블 ';

-- Column comments
comment on column tb_channel.channel_id is '채널 ID';
comment on column tb_channel.channel_name is '채널 이름';
comment on column tb_channel.refresh_rate is '데이터 조회 주기';
comment on column tb_channel.unable_menu_list is '미사용 메뉴 목록';
comment on column tb_channel.home_button_use is '홈버튼 사용 여부';
comment on column tb_channel.home_delay_time is '1차화면 로딩 지연시간';
comment on column tb_channel.app_version is '1차화면 로딩 지연시간';
comment on column tb_channel.show is 'app 노출 여부';

-- tb_game definition ---------------------------------------------------------------

-- crate table

create table tb_game (
	game_id 					varchar2(32) 				NOT NULL, 		
	series_id					varchar2(32)				NOT NULL, 
	game_name					varchar2(256) 					NULL,
	game_prize					number(12,0)					NULL,
	amt_unit        			varchar2(8)						NULL,
	game_player_cnt 			number(4,0)						NULL,
	game_round_cnt  			number(1,0)		DEFAULT 4 	NOT NULL ,
	game_open_date				char(8)							NULL,
	game_close_date				char(8)							NULL,
	constraint tb_game_pk primary key (game_id)
);
comment on table tb_game is '대회정보 테이블 ';

-- Column comments
comment on column tb_game.game_id is '대회 ID, kpga 와 동일';
comment on column tb_game.game_name is '대회 명칭';

comment on column tb_game.series_id is '대회 시리즈 명';
comment on column tb_game.game_prize is '대회 상금';
comment on column tb_game.amt_unit is '대회 상금 단위';
comment on column tb_game.game_player_cnt is '대회 참가 인원';
comment on column tb_game.game_round_cnt is '대회 라운드 수';
comment on column tb_game.game_open_date is '대회 개시일';
comment on column tb_game.game_close_date is '대회 종료일';


-- tb_course definition ---------------------------------------------------------------

-- Create table

create table tb_course (
	game_id 					varchar2(32) 				NOT NULL, 	
	course_id					varchar2(32) 				NOT NULL,
	course_name					varchar2(256)				NOT NULL,
	hole_par_1					number(1,0)		DEFAULT 4	NOT NULL,
	hole_par_2					number(1,0)		DEFAULT 4	NOT NULL,
	hole_par_3					number(1,0)		DEFAULT 4	NOT NULL,
	hole_par_4					number(1,0)		DEFAULT 4	NOT NULL,
	hole_par_5					number(1,0)		DEFAULT 4	NOT NULL,
	hole_par_6					number(1,0)		DEFAULT 4	NOT NULL,
	hole_par_7					number(1,0)		DEFAULT 4	NOT NULL,
	hole_par_8					number(1,0)		DEFAULT 4	NOT NULL,
	hole_par_9					number(1,0)		DEFAULT 4	NOT NULL,
	hole_par_10					number(1,0)		DEFAULT 4	NOT NULL,
	hole_par_11					number(1,0)		DEFAULT 4	NOT NULL,
	hole_par_12					number(1,0)		DEFAULT 4	NOT NULL,
	hole_par_13					number(1,0)		DEFAULT 4	NOT NULL,
	hole_par_14					number(1,0)		DEFAULT 4	NOT NULL,
	hole_par_15					number(1,0)		DEFAULT 4	NOT NULL,
	hole_par_16					number(1,0)		DEFAULT 4	NOT NULL,
	hole_par_17					number(1,0)		DEFAULT 4	NOT NULL,
	hole_par_18					number(1,0)		DEFAULT 4	NOT NULL,
	hole_par_out				number(2,0)		DEFAULT 36	NOT NULL,
	hole_par_in					number(2,0)		DEFAULT 36	NOT NULL,
	hole_par_sum				number(2,0)		DEFAULT 72	NOT NULL,
	constraint tb_course_pk primary key (game_id, course_id)
);
comment on table tb_course is '경기장 정보 테이블 ';

-- Column comments
comment on column tb_course.game_id is '대회 ID, kpga 와 동일';
comment on column tb_course.course_id is '경기장 ID';
comment on column tb_course.course_name is '경기장 이름';
comment on column tb_course.hole_par_1 is '경기장 1번호 hole의 PAR 수';
comment on column tb_course.hole_par_out is '경기장 OUT Hole의 전체 PAR 수';
comment on column tb_course.hole_par_in is '경기장 IN Hole의 전체 PAR 수';
comment on column tb_course.hole_par_sum is '경기장 전체 PAR 수';

-- tb_schedule definition ---------------------------------------------------------------

--create table

create table tb_schedule (
	schedule_id					varchar2(64)				NOT NULL,
	channel_id 					varchar2(32) 				NOT NULL, 
	game_id 					varchar2(32) 				NOT NULL, 	
	round_idx					number(1,0)					NOT NULL,
	day_idx						number(1,0)						NULL,
	start_datetime				char(17)					NOT NULL,
	end_datetime				char(17)					NOT NULL,
	on_air_date					char(8)							NULL,
	regist_datetime				char(17)					NOT NULL,
	constraint tb_schedule_pk primary key (schedule_id)
);
comment on table tb_schedule is '편성 정보 테이블 ';

-- Column comments
comment on column tb_schedule.schedule_id is '편성정보 ID';
comment on column tb_schedule.channel_id is '채널 ID';
comment on column tb_schedule.game_id is '대회 ID, kpga 와 동일';
comment on column tb_schedule.round_idx is 'Round 회차 정보';
comment on column tb_schedule.day_idx is '대회 일차 수';
comment on column tb_schedule.start_datetime is '방송 시작 시간';
comment on column tb_schedule.end_datetime is '방송 종료 시간';
comment on column tb_schedule.on_air_date is '방송 날짜';
comment on column tb_schedule.regist_datetime is '등록일';

-- tb_player definition ---------------------------------------------------------------

-- create table

create table tb_player (
	game_id 					varchar2(32) 				NOT NULL, 	
	player_id					varchar2(64)				NOT NULL,
	player_name					varchar2(64)				NOT NULL,
	player_english_name			varchar2(64)					NULL,
	player_image_url			varchar2(256)					NULL,
	constraint tb_player_pk primary key (game_id, player_id)
);
comment on table tb_player is '대회 선수 정보 테이블 ';

-- Column comments
comment on column tb_player.game_id is '대회 ID';
comment on column tb_player.player_id is '선수 ID';
comment on column tb_player.player_name is '선수 이름';
comment on column tb_player.player_english_name is '선수 영문 이름';
comment on column tb_player.player_image_url is '선수 사진';

-- tb_ranking definition ---------------------------------------------------------------

-- create table

create table tb_ranking (
	game_id 					varchar2(32) 				NOT NULL, 	
	player_id					varchar2(64)				NOT NULL,
	round_idx					number(1,0)					NOT NULL,
	ranking_order				number(4,0)						NULL,
	ranking						varchar2(8)						NULL,
	hole_idx					varchar2(16)					NULL,
	today_score					varchar2(16)					NULL,
	total_score					varchar2(16)					NULL,
	constraint tb_ranking_pk primary key (game_id, player_id)
);
comment on table tb_ranking is '실시간 순위 정보 테이블 ';

-- Column comments
comment on column tb_ranking.game_id is '대회 ID';
comment on column tb_ranking.round_idx is 'Round 회차 정보';
comment on column tb_ranking.player_id is '선수 ID';
comment on column tb_ranking.ranking_order is '정렬 순서';
comment on column tb_ranking.ranking is '순위';
comment on column tb_ranking.hole_idx is '현재 위치';
comment on column tb_ranking.today_score is '당일 타수';
comment on column tb_ranking.total_score is '총타수';

-- tb_scoreboard definition ---------------------------------------------------------------

-- Create table

create table tb_scoreboard (
	game_id 					varchar2(32) 				NOT NULL, 	
	player_id					varchar2(64)				NOT NULL,
	round_idx					number(1,0)					NOT NULL,
	hole_1						number(2,0)						NULL,
	hole_2						number(2,0)						NULL,
	hole_3						number(2,0)						NULL,
	hole_4						number(2,0)						NULL,
	hole_5						number(2,0)						NULL,
	hole_6						number(2,0)						NULL,
	hole_7						number(2,0)						NULL,
	hole_8						number(2,0)						NULL,
	hole_9						number(2,0)						NULL,
	hole_10						number(2,0)						NULL,
	hole_11						number(2,0)						NULL,
	hole_12						number(2,0)						NULL,
	hole_13						number(2,0)						NULL,
	hole_14						number(2,0)						NULL,
	hole_15						number(2,0)						NULL,
	hole_16						number(2,0)						NULL,
	hole_17						number(2,0)						NULL,
	hole_18						number(2,0)						NULL,
	hole_code_1					number(1,0)						NULL,
	hole_code_2					number(1,0)						NULL,
	hole_code_3					number(1,0)						NULL,
	hole_code_4					number(1,0)						NULL,
	hole_code_5					number(1,0)						NULL,
	hole_code_6					number(1,0)						NULL,
	hole_code_7					number(1,0)						NULL,
	hole_code_8					number(1,0)						NULL,
	hole_code_9					number(1,0)						NULL,
	hole_code_10				number(1,0)						NULL,
	hole_code_11				number(1,0)						NULL,
	hole_code_12				number(1,0)						NULL,
	hole_code_13				number(1,0)						NULL,
	hole_code_14				number(1,0)						NULL,
	hole_code_15				number(1,0)						NULL,
	hole_code_16				number(1,0)						NULL,
	hole_code_17				number(1,0)						NULL,
	hole_code_18				number(1,0)						NULL,
	out_score					number(3,0)						NULL,
	in_score					number(3,0)						NULL,
	total_score					number(3,0)						NULL,
	constraint tb_scoreboard_pk primary key (game_id, player_id, round_idx)
);
comment on table tb_scoreboard is '선수 스코어보드 정보 테이블 ';

-- Column comments
comment on column tb_scoreboard.game_id is '대회 ID';
comment on column tb_scoreboard.player_id is '선수 ID';
comment on column tb_scoreboard.round_idx is 'Round 회차 정보';
comment on column tb_scoreboard.hole_1 is '1번홀 타수';
comment on column tb_scoreboard.hole_code_1 is '1번홀 타수 코드, BETTER/BIRDIE/PAR/BOGEY/BOGEY+';
comment on column tb_scoreboard.out_score is 'OUT Hole의 총 타수';
comment on column tb_scoreboard.in_score is 'IN Hole의 총 타수';
comment on column tb_scoreboard.total_score is 'Round 총 타수';


-- tb_team definition ---------------------------------------------------------------

-- Create table

create table tb_team(
	team_id						varchar2(32)		NOT NULL,
	game_id 					varchar2(32) 		NOT NULL, 	
	round_idx					number(1,0)			NOT NULL,
	team_order					number(3,0)			NOT NULL,
	constraint tb_team_pk primary key (team_id)
);
comment on table tb_team is '대회 조편성 정보 ';

-- Column comments
comment on column tb_team.team_id is '팀 ID';
comment on column tb_team.game_id is '대회 ID';
comment on column tb_team.round_idx is 'Round 회차 정보';
comment on column tb_team.team_order is 'Round 별 Team 순번';


-- tb_tee_schedule definition ---------------------------------------------------------------

-- Create table
create table tb_tee_schedule (
	team_id						varchar2(32)		NOT NULL,
	on_air_date					char(8)				NOT NULL,
	tee_time					char(4)				NOT NULL,
	tee_position				varchar2(3)			NOT NULL,
	tee_date					varchar2(16)			NULL,
	constraint tb_tee_schedule_pk primary key (team_id, on_air_date)
);
comment on table tb_tee_schedule is '조별 출발 정보. ';

-- Column comments
comment on column tb_tee_schedule.team_id is '팀 ID';
comment on column tb_tee_schedule.tee_position is '출발 지점 T1/T10';
comment on column tb_tee_schedule.tee_time is '출발 시간';
comment on column tb_tee_schedule.tee_date is '날짜 호칭, ex) 첫째날 ';
comment on column tb_tee_schedule.on_air_date is '방송 날짜';

-- tb_team_player definition ---------------------------------------------------------------

-- Create table

create table tb_team_player(
	team_id						varchar2(32)		NOT NULL,
	player_id					varchar2(64)		NOT NULL,
	constraint tb_team_player_pk primary key (team_id, player_id)
);
comment on table tb_team_player is '대회 조편성 정보 ';

-- Column comments
comment on column tb_team_player.team_id is '팀 ID';
comment on column tb_team_player.player_id is '선수 ID';


-- tb_sponsor definition ---------------------------------------------------------------

-- Create table

create table tb_sponsor(
	game_id 					varchar2(32) 		NOT NULL, 	
	sponsor_id					varchar2(32)		NOT NULL,
	sponsor_name				varchar2(128)		NOT NULL,
	view_order					number(3,0)				NULL,
	thumbnail_url				varchar2(256)			NULL,
	cdn_id						varchar2(32)			NULL,
	play_uri					varchar2(256)			NULL,
	constraint tb_sponosr_pk primary key (game_id, sponsor_id)
);
comment on table tb_sponsor is '스폰서 정보 ';

-- Column comments
comment on column tb_sponsor.game_id is '대회 ID';
comment on column tb_sponsor.sponsor_id is '스폰서 ID';
comment on column tb_sponsor.sponsor_name is '스폰서 이름';
comment on column tb_sponsor.thumbnail_url is '스폰서 대표 이미지';
comment on column tb_sponsor.cdn_id is '광고 동영상의 배포 플랫폼';
comment on column tb_sponsor.play_uri is '광고 동영상의 플랫폼에서의 식별자, 위치 정보 ';
comment on column tb_sponsor.view_order is '노출 순서';



-- tb_event definition ---------------------------------------------------------------

-- Create table

create table tb_event(
	game_id 					varchar2(32) 					NOT NULL, 	
	event_id					varchar2(32)					NOT NULL,
	event_name					varchar2(128)					NOT NULL,
	view_order					number(3,0)							NULL,
	thumbnail_url				varchar2(256)						NULL,
	content						varchar2(2048)						NULL,
	constraint tb_event_pk primary key (game_id, event_id)
);
comment on table tb_event is '이벤트 정보 ';

-- Column comments
comment on column tb_event.game_id is '대회 ID';
comment on column tb_event.event_id is '이벤트 ID';
comment on column tb_event.event_name is '이벤트 이름';
comment on column tb_event.thumbnail_url is '스폰서 대표 이미지';
comment on column tb_event.content is '상세 데이터';
comment on column tb_event.view_order is '노출 순서';


-- tb_provider definition

CREATE TABLE tb_provider (
	provider_id 				varchar2(255) 				NOT NULL,
	api_key 					varchar2(255) 					NULL,
	provider_name 				varchar2(255) 					NULL,
	CONSTRAINT tb_provider_pk PRIMARY KEY (provider_id)
);
comment on table tb_provider is '접속시스템 관리 테이블';

-- Column comments
comment on column tb_provider.provider_id is '접속 시스템 아이디';
comment on column tb_provider.api_key is '인증키';
comment on column tb_provider.provider_name is '접속 시스템 명';


-- tb_vod_info definition

create table tb_vod_info (	
   	vod_id 						varchar2(32) 				not null, 
	cdn_id 						varchar2(32) 				not null, 
	description 				varchar2(255)					null, 
	game_id 					varchar2(32) 				not null, 
	has_ad 						number(1,0)		default 0	not null, 
	is_round_highlight 			number(1,0)		default 0 	not null, 
	play_time 					number(19,0)					null, 
	play_uri 					varchar2(256) 				not null, 
	player_id 					varchar2(32) 				not null, 
	player_name 				varchar2(64)					null, 
	poster_uri 					varchar2(256)					null, 
	produce_datetime 			char(17) 					not null, 
	regist_datetime 			char(17) 					not null, 
	resolution 					number(10,0)					null, 
	round_idx 					varchar2(32)					null, 
	title 						varchar2(128)					null, 
	constraint tb_vod_info_pk primary key (vod_id)
);
CREATE INDEX tb_vod_info_idx1 ON tb_vod_info ('game_id');
CREATE INDEX tb_vod_info_idx2 ON tb_vod_info ('player_id');
CREATE INDEX tb_vod_info_idx3 ON tb_vod_info ('produce_datetime');

comment on table tb_vod_info is 'VOD 정보 테이블';

-- Column comments
comment on column tb_vod_info.vod_id is 'VOD 아이디';

comment on column tb_vod_info.cdn_id is 'ㅊ우 ID';
comment on column tb_vod_info.description is 'VOD 설명';
comment on column tb_vod_info.game_id is '대회 아이디';
comment on column tb_vod_info.has_ad is '광고 삽입 여부';
comment on column tb_vod_info.is_round_highlight is 'AI Hightlight 여부';
comment on column tb_vod_info.play_time is 'VOD 재생시간(초)';
comment on column tb_vod_info.play_uri is 'VOD 재생 uri';
comment on column tb_vod_info.player_id is '선수 아이디';
comment on column tb_vod_info.poster_uri is 'VOD 이미지 아이콘 uri';
comment on column tb_vod_info.produce_datetime is 'VOD 제작 일시';
comment on column tb_vod_info.regist_datetime is 'VOD 등록 일시';
comment on column tb_vod_info.resolution is 'VOD 해상도';
comment on column tb_vod_info.round_idx is 'VOD round 회차';
comment on column tb_vod_info.title is 'VOD 제목';
