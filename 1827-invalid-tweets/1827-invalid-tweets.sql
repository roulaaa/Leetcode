-- IDs of the invalid tweets.9

SELECT tweet_id
FROM Tweets
WHERE LENGTH(content) > 15