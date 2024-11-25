package entities.keys;

import entities.Actor;
import entities.Film;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class FilmActorKey implements Serializable {
    private Film film;

    private Actor actor;

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
