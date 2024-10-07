package fooddelivery.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Entity
@Data
public class Item {

    private Long id;

    private String foodId;

    private Integer qty;

    private String option;
}
