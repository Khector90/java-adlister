import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;


public class MySQLAdsDao implements Ads {

    private Connection connection;

    public MySQLAdsDao(Config config){
        AdDriver adDriver = new AdDriver();
        connection = adDriver.getConnection();
    }

    @Override
    public List<Ad> all () throws SQLException{

    }

}
