package com.therealdanvega

import com.therealdanvega.domain.Tweet

def tweet = new Tweet("fabiomqs", "Hello Twiiter!!");
tweet.addToFavorites()
println tweet
tweet.addToRetweets()
println tweet
tweet.addToFavorites()
println tweet
