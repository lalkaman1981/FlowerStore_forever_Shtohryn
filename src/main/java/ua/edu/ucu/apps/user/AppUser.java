package ua.edu.ucu.apps.user;


import java.time.LocalDate;
import java.time.Period;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@Table(name = "app_user")
@Entity
@ToString
@NoArgsConstructor
public class AppUser {
  @Column(unique = true)
  private String email;
  @Transient
  private int age;
  private LocalDate dateOfBirth;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  public int getAge() {
    return Period.between(dateOfBirth, LocalDate.now()).getYears();
  }
}
