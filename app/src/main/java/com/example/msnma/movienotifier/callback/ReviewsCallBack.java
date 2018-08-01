package com.example.msnma.movienotifier.callback;
import com.brenopolanski.movies.model.Review;

import java.util.List;
public interface ReviewsCallBack
{
    void success(List<Review> reviews);

    void error(Exception error);
}
