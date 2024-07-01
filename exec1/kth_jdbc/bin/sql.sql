select * from tab;

select * from PC_EMP;

select * from pc_menu;

select max(menu_no)
from PC_MENU;

insert into PC_EMP values(5, '민지성', 'slave', '2007-07-11', 1045678978, '경기도 성남시', 100);

Update pc_menu
set menu_name = '제로콜라'
where menu_no = 2;

select * from pc_menu;