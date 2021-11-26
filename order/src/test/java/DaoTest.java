import github.nooblong.PayMain;
import github.nooblong.dao.PayDao;
import github.nooblong.entity.Pay;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest(classes = PayMain.class)
public class DaoTest {

    @Autowired
    PayDao payDao;

    @Test
    public void testCreate(){
        log.info("hello");
        int buck = payDao.create(new Pay(null, "fuck"));
        log.info(buck + "");
    }

}
