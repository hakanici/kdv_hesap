SELECT DISTINCT replacement_cost FROM film;
SELECT COUNT(DISTINCT replacement_cost ) FROM film
SELECT COUNT (DISTINCT title) FROM film
WHERE title LIKE 'T%' AND rating = 'G';
SELECT COUNT (country) FROM country
WHERE country ILIKE '_____';
SELECT COUNT (city) FROM city
WHERE city LIKE '%R' OR city LIKE '%r';