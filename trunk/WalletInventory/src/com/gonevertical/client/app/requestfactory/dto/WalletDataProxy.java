package com.gonevertical.client.app.requestfactory.dto;

import java.util.List;

import com.gonevertical.server.domain.WalletData;
import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.ProxyFor;

@ProxyFor(WalletData.class)
public interface WalletDataProxy extends EntityProxy {
  
  Long getId();
  
  Long getUserId();
  
  void setName(String name);
  
  String getName();
  
  void setItems(List<WallItemDataProxy> items);
  
  List<WallItemDataProxy> getItems();
  
}