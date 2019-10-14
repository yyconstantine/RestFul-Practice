package me.sxl.billbook.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 读取配置文件中的数据并将类注入ioc容器
 *
 * @author songxianglong
 * @date 2019/10/14 11:46
 */
@Configuration
@Data
@PropertySource("${filepath.config}")
public class PropertyConfig {

    @Value("${TEST_DATA}")
    private long TEST_DATA;

}
