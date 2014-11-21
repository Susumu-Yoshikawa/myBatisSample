package mybatisTest;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class selectMain {

	public static void main(String[] args) throws Exception {
		Reader reader = Resources.getResourceAsReader("mybatis/mybatis-config.xml");
        SqlSession session = new SqlSessionFactoryBuilder().build(reader).openSession();
        Automobile sample1 = (Automobile)session.selectOne("select", 11);
        System.out.println(sample1);
        // List
        List<Automobile> sample2 = (List<Automobile>)session.selectList("select_all");
        for (Automobile a : sample2) {
            System.out.println("a = [" + a + "]");
        }
        // Insert
        Automobile insert_data = new Automobile(111,"bbb" , "foo" , 19790114);
        session.insert("insert", insert_data);

        session.commit();

	}

}
