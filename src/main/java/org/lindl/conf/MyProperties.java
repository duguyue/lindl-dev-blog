package org.lindl.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by lin on 2017/7/16.
 */
@Component
public class MyProperties {

    @Value("${org.lindl.title}")
    private String title;

    @Value("${org.lindl.description}")
    private String description;
}
