package com.application.demo;

import com.treasure.tool.entity.CreateExcel;
import com.treasure.tool.entity.ExcelTemplateParams;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        ExcelTemplateParams templateParams = new ExcelTemplateParams();
        templateParams.setFileName("D:/test01.xlsx");
        templateParams.setFirstRow(1);
        templateParams.setLastRow(20);
        templateParams.setFlag(true);
        templateParams.setRowIndex(0);
        templateParams.setSheetName("test");
        templateParams.setParamsList(Arrays.asList(new ExcelTemplateParams.MenuParams("a",3),
                new ExcelTemplateParams.MenuParams("d",2)));
        String path = getClass().getClassLoader().getResource("test.json").toString();
        System.out.println(path);
        path = path.replace("\\", "/");
        if (path.contains(":")) {
            path = path.replace("file:/", "");// 2
        }
        templateParams.setReadFilepath(path);
        new CreateExcel().createExcelTemplate2007(templateParams);

    }



}
