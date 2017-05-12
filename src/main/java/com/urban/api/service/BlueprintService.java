package com.urban.api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by hurban on 11/05/17.
 */
@Service
public class BlueprintService {

    private static final Logger logger = LoggerFactory.getLogger(BlueprintService.class);

    public void dummyMethod(){
        logger.info("This is a log line");
    }
}
