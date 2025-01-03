package entities;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(schema = "movie", name = "language")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Byte language_id;

    @Column(nullable = false, length = 20, columnDefinition = "char")
    private String name;

    @Column(nullable = false)
    @UpdateTimestamp
    private LocalDateTime last_update;

    public Byte getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Byte language_id) {
        this.language_id = language_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLast_update() {
        return last_update;
    }

    public void setLast_update(LocalDateTime last_update) {
        this.last_update = last_update;
    }
}
