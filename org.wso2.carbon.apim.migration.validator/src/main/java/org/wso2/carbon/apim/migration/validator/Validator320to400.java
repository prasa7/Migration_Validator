package org.wso2.carbon.apim.migration.validator;
import org.wso2.carbon.apim.migration.validator.dao.ValidatorDAO320to400;

import java.sql.*;
import java.util.logging.Logger;

public class Validator320to400 {

    public static String validateTableCount()
    {
        final Logger LOGGER = Logger.getLogger(Validator320to400.class.getName());

        ValidatorDAO320to400 validate = new ValidatorDAO320to400();
        boolean countValidator = validate.validateAPIMDbTableCount(176,"apim_db");

        if(countValidator) {
            LOGGER.info("3.2.0 to 4.0.0 table count validation is successful.");
            return "3.2.0 to 4.0.0 table count validation is successful.";
        }
        else {
            LOGGER.info("3.2.0 to 4.0.0 table count validation is fail.");
            return "3.2.0 to 4.0.0 table count validation is fail.";
        }

    }
}
