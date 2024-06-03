SELECT title,length from film
WHERE title LIKE '%n'
ORDER BY length DESC
LIMIT 5;

SELECT title,length FROM film
WHERE title LIKE '%n'
ORDER BY length
OFFSET 1
LIMIT 5;

SELECT last_name,store_id FROM customer
WHERE store_id=1
ORDER BY last_name
LIMIT 4;