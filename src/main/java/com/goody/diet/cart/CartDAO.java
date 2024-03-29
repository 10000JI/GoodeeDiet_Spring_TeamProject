package com.goody.diet.cart;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CartDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.goody.diet.cart.CartDAO.";
	
//	민지	
	public List<CartDTO> getCartList(CartDTO cartDTO) throws Exception{
		return sqlSession.selectList(NAMESPACE+"getCartList", cartDTO);
	}
	
	//구매 후 studyNum update
	public int setMemberStudyNum (CartDTO cartDTO) throws Exception{
		return sqlSession.update(NAMESPACE+"setMemberStudyNum", cartDTO);
	}
	
	//구매 후 study stock-1
		public int setStudyStock (CartDTO cartDTO) throws Exception{
			return sqlSession.update(NAMESPACE+"setStudyStock", cartDTO);
	}
	
	public List<CartDTO> getPaymentList(CartDTO cartDTO) throws Exception{
		return sqlSession.selectList(NAMESPACE+"getPaymentList", cartDTO);
	}
	
	public int setCartStudyAdd(CartDTO cartDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"setCartStudyAdd", cartDTO);
	}
	
	public int setCartCheckUpdate(Long item) throws Exception{
		return sqlSession.update(NAMESPACE+"setCartCheckUpdate", item);
	}
	
	public int setCartCountUpdate(CartDTO cartDTO)throws Exception{
		return sqlSession.update(NAMESPACE+"setCartCountUpdate", cartDTO);
	}
	public int setCartCheckDefaultUpdate(CartDTO cartDTO) throws Exception{
		return sqlSession.update(NAMESPACE+"setCartCheckDefaultUpdate", cartDTO);
	}
//	태현
	public List<CartDTO> getCartMachineList(CartDTO cartDTO)throws Exception{
		return sqlSession.selectList(NAMESPACE+"getCartMachineList", cartDTO);
	}
	
	public int setCartMachineAdd(CartDTO cartDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setCartMachineAdd",cartDTO);
	}
	public int setCartMachineCount(CartDTO cartDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setCartMachineCount", cartDTO);
	}
	public List<CartDTO> getPaymentMachineList(CartDTO cartDTO)throws Exception{
		return sqlSession.selectList(NAMESPACE+"getPaymentMachineList", cartDTO);
	}
	public int setCartStatusUpdate(CartDTO cartDTO)throws Exception{
		return sqlSession.update(NAMESPACE+"setCartStatusUpdate", cartDTO);
	}
	
	public int setCartDelete(Long item) throws Exception{
		return sqlSession.delete(NAMESPACE+"setCartDelete", item);
	}
	
	//구매 후 machine stock-1
	public int setMachineStock (CartDTO cartDTO) throws Exception{
		return sqlSession.update(NAMESPACE+"setMachineStock", cartDTO);
}

}
