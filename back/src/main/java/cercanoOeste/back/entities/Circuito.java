package cercanoOeste.back.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "circuito")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Circuito extends  Base{
    private Date fechaAlta;
    private Date fechabaja;

}
