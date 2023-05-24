package org.akakce.ui.scenarios;

import org.akakce.ui.base.BaseScenario;
import org.akakce.ui.functions.CaseStudyFunction;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CaseStudyScenario extends BaseScenario {
    CaseStudyFunction caseStudyFunction;

    static Logger logger = Logger.getLogger(CaseStudyScenario.class.getName());
    @Before
    public void before(){
        caseStudyFunction = new CaseStudyFunction(getWebDriver());
    }

    @Test
    public void test() {
        if (!caseStudyFunction.checkPage()) {
            logger.info("Test senaryosu başlatıldı.");
            after();
        }

        caseStudyFunction
                .clickSearchArea()
                .search("dyson")
                .clickSearchButton()
                .clickProduct()
                .clickFollowProduct()
                .clickMailArea()
                .eMAil("aslihaninciakdogan@gmail.com")
                .clickPasswordArea()
                .Password("Test123")
                .clickLoginButton();
    }
        @After
        public void after(){
            logger.info("Test senaryosu tamamlandı.");
            tearDown();
        }
    }

