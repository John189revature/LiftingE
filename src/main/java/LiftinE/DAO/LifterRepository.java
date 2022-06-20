package LiftinE.DAO;

import LiftinE.Model.Lifter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LifterRepository extends JpaRepository<Lifter, Integer> {

    @Query("from Lifter")
    public List<Lifter> findAllLifter();
    @Query("from Lifter where userName = :userName")
    public Lifter findLifterByUserName(@Param("userName")String userName);
  @Query("from Lifter where liftTotal = (select max(liftTotal) from Lifter)")
  public Lifter findMaxLifter();
}
