select * from tab;
select
            book_id bookId,
        	book_title bookTitle,
    		price,
			pub_id pubId
		from books;
        WHERE book_id LIKE 8
        ;

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