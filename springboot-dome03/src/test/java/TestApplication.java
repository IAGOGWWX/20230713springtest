import com.jyl.domain.Guest;

import java.util.ArrayList;
import java.util.List;

public class TestApplication {

    public static void main(String[] args) {
        List<Guest> list = new ArrayList<>();

        list.add(new Guest("ZS","123"));
        list.add(new Guest("ZS1","1233"));
        list.add(new Guest("ZS2","12333"));
        list.add(new Guest("ZS3","123444"));
        System.out.println(list.toString());
        update(list);
        System.out.println(list.toString());

    }

    public static void  update(List<Guest> guests){

        Guest guest = guests.get(1);
        guest.setRole("jiangyalun ");

    }
}
