package com.learn.CallThirdPartyApi1.modal;

public class Book {

private String entityId;
private String source;
private Data data;


public Book(String entityId, String source, Data data) {
	super();
	this.entityId = entityId;
	this.source = source;
	this.data = data;
}
public String getEntityId() {
    return entityId;
}
public void setEntityId(String entityId) {
    this.entityId = entityId;
}
public String getSource() {
    return source;
}
public void setSource(String source) {
    this.source = source;
}
public Data getData() {
    return data;
}
public void setData(Data data) {
    this.data = data;
}
}
