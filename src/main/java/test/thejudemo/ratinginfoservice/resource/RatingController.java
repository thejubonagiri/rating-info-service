package test.thejudemo.ratinginfoservice.resource;

import test.thejudemo.ratinginfoservice.entity.CatalogRatings;
import test.thejudemo.ratinginfoservice.entity.RatingDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @GetMapping(path = "/{movieId}")
    public List<RatingDetails> getRatingsDetails (@PathVariable("movieId") String movieId)
    {
        List<RatingDetails> ratingDetails = Collections.singletonList(new RatingDetails(123 , 8));
        return ratingDetails;
    }

    @GetMapping(path = "/users/{userId}")
    public CatalogRatings getRatingsforUser (@PathVariable("userId") String userId)
    {
       CatalogRatings catalogRatings = new CatalogRatings();
        List<RatingDetails> ratingDetailList = Arrays.asList(
                new RatingDetails(1234, 4),
                new RatingDetails(3456, 5)
        );
        catalogRatings.setRatingDetails(ratingDetailList);
        return catalogRatings;
    }
}
