package LiftinE.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Lifter {
    @Id
    @Column
    private int lifter_ID;
    @Column
    private String userName;
    @Column
    private int liftTotal;

}
