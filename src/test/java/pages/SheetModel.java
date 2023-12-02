package pages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor()
public class SheetModel {
    String termino;
    String name;
    String country;
    String city;
    String card;
    String month;
    String year;
    String userName;
    String password;
    String section;
}
