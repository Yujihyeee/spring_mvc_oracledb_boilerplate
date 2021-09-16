select * from tab;
select
            book_id bookId,
        	book_title bookTitle,
    		price,
			pub_id pubId
		from books
        WHERE book_id LIKE 8;
        

SELECT
    * FROM publishers;
    
select
    cust_id custId,
    cust_name custName,
    address,
    cust_phone custPhone
    from customers;
    where cust_id like cust_id;
    
    
select
    pub_id pubId,
    pub_name pubName,
    mgr_name mgrName,
    phone
    from publishers;
    
    

select  * FROM orders;


SELECT
    order_id orderId,
    cust_id custId,
    book_id bookId,
    order_price orderPrice,
    order_date orderDate
    FROM orders;
    
    
    
    
create table photo(
    photo_id NUMBER PRIMARY KEY,
    album_id NUMBER,
    location_id NUMBER,
    member_id NUMBER,
    p_title VARCHAR2(120),
    des VARCHAR2(255),
    privacy VARCHAR2(20),
    upload DATE DEFAULT sysdate,
    view_photo NUMBER,
    imagepath VARCHAR2(50)
);

select * from photo;
insert into photo VALUES(1,1,1,1,'qwe','rty','asd',TO_DATE('2021-09-15', 'yyyy-mm-dd'), 1, 'fgh');
insert into photo VALUES(2,2,2,2,'qwe2','rty2','asd2',TO_DATE('2021-09-05', 'yyyy-mm-dd'), 2, 'fgh2');
insert into photo VALUES(3,3,3,3,'qwe3','rty3','asd3',TO_DATE('2021-09-12', 'yyyy-mm-dd'), 3,'fgh3');
insert into photo VALUES(4,4,4,4,'qwe4','rty4','asd4',TO_DATE('2021-09-17', 'yyyy-mm-dd'), 4, 'fgh4');
insert into photo VALUES(5,5,5,5,'qwe5','rty5','asd5',TO_DATE('2021-09-13', 'yyyy-mm-dd'), 5, 'fgh5');

desc photo;
commit;

