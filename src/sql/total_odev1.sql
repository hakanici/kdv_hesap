--ödev1
SELECT title, description FROM film;
SELECT * FROM film WHERE length>60 AND length<75;
SELECT * FROM film WHERE rental_rate = 0.99 AND replacement_cost = 12.99 OR replacement_cost = 28.99;
SELECT first_name , last_name FROM customer WHERE first_name='Mary';
SELECT * FROM film WHERE NOT length > 50 AND NOT rental_rate = 2.99 AND NOT rental_rate = 4.99
--ödev2
SELECT * FROM film
WHERE replacement_cost BETWEEN 12.99 AND 16.98;
SELECT first_name , last_name FROM actor
WHERE first_name IN ('Penelope' , 'Nick' , 'Ed');
SELECT * FROM film
WHERE rental_rate IN(0.99 , 2.99 , 4.99) AND replacement_cost IN(12.99 , 15.99 , 28.99);
--ödev3
SELECT country FROM country
WHERE country ILIKE 'a%a'
SELECT country FROM country
WHERE country ILIKE '%_____n'
SELECT title FROM film
WHERE title ILIKE '%t%t%t%t%';
SELECT * FROM film
WHERE title LIKE 'C%' AND length > 90 AND rental_rate = 2.99;
--ödev4
SELECT DISTINCT replacement_cost FROM film;
SELECT COUNT(DISTINCT replacement_cost ) FROM film
SELECT COUNT (DISTINCT title) FROM film
WHERE title LIKE 'T%' AND rating = 'G';
SELECT COUNT (country) FROM country
WHERE country ILIKE '_____';
SELECT COUNT (city) FROM city
WHERE city LIKE '%R' OR city LIKE '%r';