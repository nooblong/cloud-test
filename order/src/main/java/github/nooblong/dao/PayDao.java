package github.nooblong.dao;

import github.nooblong.entity.Pay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PayDao {
    public int create(Pay pay);

    public Pay getPayById(@Param("id") int id);
}
