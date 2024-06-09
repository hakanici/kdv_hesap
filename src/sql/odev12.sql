--film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?
SELECT title,length from film
Where length>
(
	SELECT AVG(length) FROM film
);

--film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?
SELECT title,rental_rate from film
Where rental_rate=
(
	SELECT MAX(rental_rate) from film
);

--film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.
SELECT rental_rate,replacement_cost from film
WHERE rental_rate =
(
	SELECT MIN(rental_rate) from film
)
AND replacement_cost=
(
	SELECT MIN(replacement_cost) from film
)

--payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.
SELECT customer_id, COUNT(*) AS payment_count from payment
GROUP BY customer_id
ORDER BY payment_count DESC;



