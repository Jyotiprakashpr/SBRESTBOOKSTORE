package com.ashokit.binding;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Books {
	
	private List<Book> booksList;

}
