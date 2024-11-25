package entities.keys;

import entities.Category;
import entities.Film;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class FilmCategoryKey implements Serializable {
    private Film film;

    private Category category;

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
