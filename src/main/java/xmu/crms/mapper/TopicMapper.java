package xmu.crms.mapper;

import java.math.BigInteger;
import java.util.List;

import xmu.crms.entity.SeminarGroupTopic;
import xmu.crms.entity.Topic;
import xmu.crms.exception.TopicNotFoundException;
import xmu.crms.service.GradeService;
import xmu.crms.service.TopicService;

public interface TopicMapper {

	/**
     * 按topicId获取topic.
     * <p>按topicId获取topic<br>
     * @param topicId 要获取的topic的topicId
     * @author lhl
     */
    Topic getTopicByTopicId(BigInteger topicId);

    
     /**
     * 根据topicId修改topic.
     * <p>根据topicId修改topic<br>
     *
     * @param topic   修改后的讨论课
     * @author lhl
     */
     void updateTopicByTopicId(Topic topic);

    
     /**
     * 删除topic.
     * <p>删除topic表中相应讨论课的topic<br>
     *
     * @param topicId 要删除的topic的topicId
     * @author lhl
     */
     void deleteTopicByTopicId(BigInteger topicId);

    
     /**
     * 按seminarId获取Topic.
     * <p>按seminarId获取Topic<br>
     *
     * @param seminarId 课程Id
     * @author lhl
     */
     List<Topic> listTopicBySeminarId(BigInteger seminarId);

     
     /**
      * 根据讨论课Id和topic信息创建一个话题.
      * <p>根据讨论课Id和topic信息创建一个话题<br>
      *
      * @param topic     话题
      * @return 新建话题后给topic分配的Id
      * @author lhl
      */
     BigInteger insertTopicBySeminarId(Topic topic);

     
     /**
      * 小组取消选择话题.
      * <p>小组取消选择话题  <br>
      * <p>删除seminar_group_topic表的一条记录<br>
      *
      * @param groupId 小组Id
      * @param topicId 话题Id
      * @author lhl
      */
     void deleteSeminarGroupTopicById(BigInteger groupId,BigInteger topicId);

     
      /**
      * 按topicId删除SeminarGroupTopic表信息.
      * <p>删除seminar_group_topic表中选择了某个话题的全部记录<br>
      *
      * @param topicId 讨论课Id
      * @author lhl
      */
     void deleteSeminarGroupTopicByTopicId(BigInteger topicId);

     
      /**
      * 按话题id和小组id获取讨论课小组选题信息（包括该小组该话题展示成绩）
      * <p>按话题id和小组id获取讨论课小组选题信息（包括该小组该话题展示成绩）<br>
      * @param topicId 话题id
      * @param groupId 组id
      * @return seminarGroupTopic 讨论课小组选题信息
      * @author lhl
      */
      SeminarGroupTopic getSeminarGroupTopicById(BigInteger topicId, BigInteger groupId);

      
      /**
       * 根据小组id获取该小组该堂讨论课所有选题信息
       * <p>根据小组id获取该小组该堂讨论课所有选题信息<br>
       * @param groupId
       * @return list 该小组该堂讨论课选题列表
       * @author lhl
       */
       List<SeminarGroupTopic> listSeminarGroupTopicByGroupId(BigInteger groupId);

       
        /**
        * 按seminarId删除话题.
        * <p>删除某讨论课下的所有Topic<br>
        * <p>根据seminarId获得topic信息，然后再根据topic删除seninargrouptopic信息和根据seminarGroupTopicId删除StudentScoreGroup信息，最后再根据删除topic信息<br>
        *
        * @param seminarId 讨论课Id
        * @author lhl
        */
        void deleteTopicBySeminarId(BigInteger seminarId);
}
