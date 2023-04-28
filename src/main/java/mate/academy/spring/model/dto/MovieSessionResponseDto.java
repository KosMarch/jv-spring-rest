package mate.academy.spring.model.dto;

import java.time.LocalDateTime;

public class MovieSessionResponseDto {
    private Long id;
    private Long movie;
    private Long cinemaHall;
    private LocalDateTime showTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMovie() {
        return movie;
    }

    public void setMovie(Long movie) {
        this.movie = movie;
    }

    public Long getCinemaHall() {
        return cinemaHall;
    }

    public void setCinemaHall(Long cinemaHall) {
        this.cinemaHall = cinemaHall;
    }

    public LocalDateTime getShowTime() {
        return showTime;
    }

    public void setShowTime(LocalDateTime showTime) {
        this.showTime = showTime;
    }
}
