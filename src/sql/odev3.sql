SELECT country FROM country
WHERE country ILIKE 'a%a'
SELECT country FROM country
WHERE country ILIKE '%_____n'
SELECT title FROM film
WHERE title ILIKE '%t%t%t%t%';
SELECT * FROM film
WHERE title LIKE 'C%' AND length > 90 AND rental_rate = 2.99;
