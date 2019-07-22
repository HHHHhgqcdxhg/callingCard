package com.ggemo.callingCard.provider.db.dao;

import com.ggemo.callingCard.provider.db.dos.CardsDO;
import com.ggemo.callingCard.provider.db.dos.CardsParam;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * This class was generated by Ali-Generator
 * @author hhhhhg
 */
@Mapper
public interface CardsDAO {
    /**
     * @param cardsParam
     * @return
     *
     * @mbg.generated
     */
    long countByParam(CardsParam cardsParam);

    /**
     * @param cardsParam
     * @return
     *
     * @mbg.generated
     */
    int deleteByParam(CardsParam cardsParam);

    /**
     * @param id
     * @return
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @param record
     * @return
     *
     * @mbg.generated
     */
    int insert(CardsDO record);

    /**
     * @param record
     * @return
     *
     * @mbg.generated
     */
    int insertSelective(CardsDO record);

    /**
     * @param cardsParam
     * @return
     *
     * @mbg.generated
     */
    List<CardsDO> selectByParam(CardsParam cardsParam);

    /**
     * @param id
     * @return
     *
     * @mbg.generated
     */
    CardsDO selectByPrimaryKey(Long id);

    /**
     * @param record
     * @param cardsParam
     * @return
     *
     * @mbg.generated
     */
    int updateByParamSelective(@Param("record") CardsDO record, @Param("cardsParam") CardsParam cardsParam);

    /**
     * @param record
     * @param cardsParam
     * @return
     *
     * @mbg.generated
     */
    int updateByParam(@Param("record") CardsDO record, @Param("cardsParam") CardsParam cardsParam);

    /**
     * @param record
     * @return
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CardsDO record);

    /**
     * @param record
     * @return
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CardsDO record);

    /**
     * @param records
     * @return
     *
     * @mbg.generated
     */
    int batchInsert(List<CardsDO> records);
}