package com.amnotion.customer.comments.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.camel.Exchange;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.amnotion.customer.comments.model.CustomerComment;

@Component
public class CommentsProcessor {

	
	/***
	 * Method: searchComments
	 * Description: search for CommentsProcessor within parameters
	 * @category method
	 * @author mkrishna
	 * @param exchange
	 * @throws BusinessException
	 * @throws Exception
	 */
	@Bean
	public List<CustomerComment> search() throws Exception {
		
		
		List<CustomerComment> customerCommentsList = new ArrayList<>();
		
		CustomerComment customerComment = new CustomerComment();
		customerComment.setCommentId("1");
		customerComment.setEntryDate("1170101");
		customerComment.setCustomerName("John Doe");
		customerComment.setSequenceNumber("1");
		customerComment.setCommentLineText("This is a mock test comment");
		customerComment.setUserId("JDOE");
		customerCommentsList.add(customerComment);
		
		return customerCommentsList;
	}
	
}
