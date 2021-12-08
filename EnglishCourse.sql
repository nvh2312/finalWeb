 use [EnglishCourse]
create table Users(
id_user int not null primary key identity(1,1),
username nvarchar(255) not null,
password nvarchar(max) not null,
avatar nvarchar(max),
email ntext,
account_balance int default 0,
profile_title ntext not null,
profile_description ntext not null,
fullname ntext not null,
role_id int not null,
create_at datetime DEFAULT (getdate())
FOREIGN KEY (role_id) REFERENCES RoleType(role_id)
)
go
create table Courses(
id_course int not null primary key identity(1,1),
name_course nvarchar(255) not null,
course_image nvarchar(max),
fee int not null,
course_duration int not null,
teacher_name nvarchar(255),
course_description ntext not null,
category int not null,
FOREIGN KEY (category) REFERENCES Category(cate_id)
)
drop table Bill
create table Bill(
id_bill int not null primary key identity(1,1),
id_course int not null ,
id_user int not null,
FOREIGN KEY (id_course) REFERENCES Courses(id_course),
FOREIGN KEY (id_user) REFERENCES Users(id_user)
)
create table RoleType(
role_id int not null primary key,
role_name nvarchar(20) not null,
)
create table Category(
cate_id int not null primary key,
cate_name nvarchar(50) not null)
insert into [dbo].[RoleType] values(1,N'Administrator')
insert into [dbo].[RoleType] values(2,N'Primary User')
insert into [dbo].[RoleType] values(3,N'Moderator')
insert into [dbo].[Category] values (0,'Listening')
insert into [dbo].[Category] values (1,'Speaking')
insert into [dbo].[Category] values (2,'Reading')
insert into [dbo].[Category] values (3,'Writing')
select * from [dbo].[RoleType]
delete from[dbo].[RoleType] 
select * from [dbo].[Courses]
select * from [dbo].[Users]
insert into [dbo].[Courses] values (N'3 lỗi sai "chết người" khiến bạn phát âm tiếng Anh sai','https://i.ytimg.com/vi/eMS3IExZBAI/maxresdefault.jpg',199,3,'Brian',N' CĂN BỆNH PHÁT ÂM "KINH ĐIỂN" CỦA NGƯỜI VIỆT
Tặng kèm #thần_dược_chữa_bệnh phía dưới
Trải nghiệm phương pháp học tiếng Anh hiệu quả, vui nhộn tại https://langmaster.edu.vn/lls2/#box_dangKy',1)




insert into [dbo].[Courses] values (N'English Grammar Launch: Upgrade your speaking and listening','https://img-c.udemycdn.com/course/240x135/1008166_b09b.jpg',13.99,6
,'Anthony Kelleher',N' Learn English grammar through lectures and listening and speaking practice, so you can confidently speak English.',1)
insert into [dbo].[Courses] values (N'English for Beginners: Intensive Spoken English Course','https://img-c.udemycdn.com/course/240x135/1526882_ea81_43.jpg',79,34,'Danie'
,N' English speaking course. 77 Hours of English language speaking, English listening practice. 1000 English language words',1)
insert into [dbo].[Courses] values (N'English Speaking Complete: English Language Mastery'
,'https://img-c.udemycdn.com/course/240x135/3450012_b156_5.jpg',29,45, 'Davis Morish'
,'Supercharge your English speaking fluency and improve your vocabulary, grammar and English language skills.',1)
insert into [dbo].[Courses] values (N'Speaking English like an English Speaker – Speak English Better'
,'https://i.pinimg.com/originals/d3/24/fd/d324fd44a0372c756b2d913d53eb28f1.jpg',19,5,'Jennifer Glover'
,N' Level 1: Avoid common mistakes made by native French speakers – Learn English with this speaking course',1)



insert into [dbo].[Courses] values (N'IELTS Vocabulary: Learn 400 Essential Words for IELTS','https://img-c.udemycdn.com/course/240x135/749942_7039_7.jpg',59,5,'Charles',N' Improve your IELTS Band Score by learning key words for the IELTS Writing, Speaking, Reading and Listening Tests',0)
insert into [dbo].[Courses] values (N'IELTS Step-by-step | Mastering Listening','https://img-c.udemycdn.com/course/240x135/2322416_0c75_6.jpg',13,5,'James Castleden'
,N' Learn everything you need for the IELTS Listening exam ',0)
insert into [dbo].[Courses] values (N'IELTS Band 8+ : IELTS Listening + Grammar'
,'https://img-c.udemycdn.com/course/240x135/3446860_800c_5.jpg',24,24,'Jackson K'
,N' IELTS Listening + Grammar Crash course ',0)
insert into [dbo].[Courses] values (N'Cách tự luyện đề Listening hiệu quả nhất tại nhà (có kèm ví dụ)'
,'https://yt3.ggpht.com/ytc/AKedOLQAurkBmgkOs82T1Up6kzGnxh8I-d8w2Dsq7kbo=s88-c-k-c0x00ffffff-no-rj',0,1,'Datio'
,N' Học tiếng Anh cùng Datio  https://www.youtube.com/watch?v=Vg8WueHXhVE',0)



insert into [dbo].[Courses] values (N'English Writing Skills','https://img-c.udemycdn.com/course/240x135/1264542_372c_2.jpg',13.99,36,'Davis Bounghton',N' Improve your English Writing by building the skills you need for business, academic, or personal use ',3)
insert into [dbo].[Courses] values (N'English Grammar: How to Avoid English Writing Mistakes | Mastering Listening','https://img-c.udemycdn.com/course/240x135/4025358_1b39_2.jpg',13.99,24,'Mastery'
,N' Learn how to write GREAT TEXTS without worrying about GRAMMATICAL MISTAKES ',3)
insert into [dbo].[Courses] values (N'Basic English Writing'
,'https://img-c.udemycdn.com/course/240x135/455708_34c9_3.jpg',29,22,'Johnson'
,N' Learn to write with confidence using well constructed sentences and paragraphs to convey your message more effectively.',3)
insert into [dbo].[Courses] values (N'Learn English: The Next Gen Guide to English Grammar'
,'https://img-c.udemycdn.com/course/240x135/1177914_4ecc_4.jpg',29,24,'Kevin Knight'
,N' Learn English Grammar! Improve your speaking, listening, reading and writing skills with high-quality videos & resources',3)


insert into [dbo].[Courses] values (N'IELTS MUSKETEER ZONE | READING: How to read effectively |','https://yt3.ggpht.com/3oI7IZ8GTuX82ADsBFEsSpWeZpFWEXidxuF2iYMAVSXP5cwPn0_rtq5bbDz3bHIXOEFuroYh=s88-c-k-c0x00ffffff-no-rj',0,0.5,'New Musketeer Quang Nguyễn',N' IELTS FACE-OFF, season 2 của 8 IELTS - talkshow tiếng Anh cung cấp cho bạn tất cả những gì bạn cần cho kỳ thi IELTS https://www.youtube.com/channel/UCnidVRZng96xx-OVc6dK6fQ',2)
insert into [dbo].[Courses] values (N'Reading for Beginner A1 ','https://learnenglish.britishcouncil.org/sites/podcasts/files/styles/max_1300x1300/public/RS8046_GettyImages-1036609896-hig.jpg?itok=MbOoWQsT',19,24,'British Council'
,N' Reading practice to help you understand simple information, words and sentences about known topics. Texts include posters, messages, forms and timetables.',2)
insert into [dbo].[Courses] values (N'Advanced English grammar+IELTS foundations for all'
,'https://img-c.udemycdn.com/course/240x135/3099314_c01a_3.jpg',59,9.5,'Rance Keating'
,N' LDevelop foundations for IELTS with advanced grammar/listening/reading/speaking/writing skills - all in one ',2)
insert into [dbo].[Courses] values (N'English - The Psychology of Memorizing English Vocabulary'
,'https://img-c.udemycdn.com/course/240x135/1177914_4ecc_4.jpg',59,24,'Rance Keating'
,N' Learn MEMORIZING methods for English vocabulary + methods to improve reading, listening and English speaking skills!',2)
select * from [dbo].[Users]

insert into [dbo].[Bill] values(1,1)
insert into [dbo].[Bill] values(1,2)
insert into [dbo].[Bill] values(2,3)
select * from [dbo].[Bill]
delete from [dbo].[Bill]