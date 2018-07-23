package com.db;

import com.db.Repository.DicRepository.DicStageRepository;
import com.db.Tables.Dictionary.DicStage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


@RunWith(SpringRunner.class)
//@SpringBootTest
@DataJpaTest
public class EfkoApplicationTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private DicStageRepository repository;

    @Test
    public void testRep() throws Exception {
        DicStage stage = new DicStage();
        stage.setTerm("gaf");
        this.entityManager.persist(stage);
        DicStage user = (DicStage) this.repository.findByTerm("gaf");
        assertThat(user.getTerm()).isEqualTo("sboot");

    }

	@Test
	public void contextLoads() {
	}

}
