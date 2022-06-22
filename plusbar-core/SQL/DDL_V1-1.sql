ALTER TABLE TB_GAME 
ADD  
( title varchar2(256) NULL, content varchar2(2048) NULL, game_image_url varchar2(256) NULL, winning_prize number(12,0) NULL  )
;

ALTER TABLE TB_COURSE ADD 
(
	course_image_url			varchar2(256) 				NULL ,
	hole_image_url_1			varchar2(256) 				NULL ,
	hole_image_url_2			varchar2(256) 				NULL ,
	hole_image_url_3			varchar2(256) 				NULL ,
	hole_image_url_4			varchar2(256) 				NULL ,
	hole_image_url_5			varchar2(256) 				NULL ,
	hole_image_url_6			varchar2(256) 				NULL ,
	hole_image_url_7			varchar2(256) 				NULL ,
	hole_image_url_8			varchar2(256) 				NULL ,
	hole_image_url_9			varchar2(256) 				NULL ,
	hole_image_url_10			varchar2(256) 				NULL ,
	hole_image_url_11			varchar2(256) 				NULL ,
	hole_image_url_12			varchar2(256) 				NULL ,
	hole_image_url_13			varchar2(256) 				NULL ,
	hole_image_url_14			varchar2(256) 				NULL ,
	hole_image_url_15			varchar2(256) 				NULL ,
	hole_image_url_16			varchar2(256) 				NULL ,
	hole_image_url_17			varchar2(256) 				NULL ,
	hole_image_url_18			varchar2(256) 				NULL ,
	hole_content_1			varchar2(1024) 				NULL ,
	hole_content_2			varchar2(1024) 				NULL ,
	hole_content_3			varchar2(1024) 				NULL ,
	hole_content_4			varchar2(1024) 				NULL ,
	hole_content_5			varchar2(1024) 				NULL ,
	hole_content_6			varchar2(1024) 				NULL ,
	hole_content_7			varchar2(1024) 				NULL ,
	hole_content_8			varchar2(1024) 				NULL ,
	hole_content_9			varchar2(1024) 				NULL ,
	hole_content_10			varchar2(1024) 				NULL ,
	hole_content_11			varchar2(1024) 				NULL ,
	hole_content_12			varchar2(1024) 				NULL ,
	hole_content_13			varchar2(1024) 				NULL ,
	hole_content_14			varchar2(1024) 				NULL ,
	hole_content_15			varchar2(1024) 				NULL ,
	hole_content_16			varchar2(1024) 				NULL ,
	hole_content_17			varchar2(1024) 				NULL ,
	hole_content_18			varchar2(1024) 				NULL 
)
;