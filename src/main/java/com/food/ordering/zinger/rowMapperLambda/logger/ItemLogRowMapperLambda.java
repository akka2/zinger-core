package com.food.ordering.zinger.rowMapperLambda.logger;

import com.food.ordering.zinger.constant.Enums.Priority;
import com.food.ordering.zinger.model.logger.ItemLogModel;
import org.springframework.jdbc.core.RowMapper;

import static com.food.ordering.zinger.constant.Column.ItemLogColumn.*;

public class ItemLogRowMapperLambda {
    public static final RowMapper<ItemLogModel> itemLogRowMapperLambda = (rs, rownum) -> {
        ItemLogModel item = new ItemLogModel();
        item.setId(rs.getInt(id));
        item.setErrorCode(rs.getInt(errorCode));
        item.setUserId(rs.getInt(userId));
        item.setMessage(rs.getString(message));
        item.setUpdatedValue(rs.getString(updatedValue));
        item.setDate(rs.getTimestamp(date));
        item.setPriority(Priority.valueOf(rs.getString(priority)));
        return item;
    };
}
