package com.kevin.building.activity;

import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.kevin.building.R;
import com.kevin.building.base.BaseActivity;
import com.kevin.building.constants.IntentKey;
import com.kevin.building.utils.ActivityUtils;

import java.util.HashMap;

/**
 * 注册
 */
public class RegistActivity extends BaseActivity
{
	private EditText et_username;
	private EditText et_password;
	private EditText et_confirm_pwd;

	@Override
	protected int getLayoutResId()
	{
		return R.layout.activity_regist;
	}


	@Override
	protected void initView() {
		titleView.setTitleText(getString(R.string.register));
		titleView.setRightBtnVisibility(View.GONE);
		findViewById(R.id.btn_regist).setOnClickListener(this);
		et_username= (EditText) findViewById(R.id.et_username);
		et_password= (EditText) findViewById(R.id.et_pwd);
		et_confirm_pwd= (EditText) findViewById(R.id.et_confirm_pwd);
	}

	@Override
	protected void initLogic() {

	}




	@Override
	protected void handleMsg(Message msg)
	{
		// TODO Auto-generated method stub

	}

	@Override
	protected void onViewClick(View v)
	{
		switch (v.getId())
		{
			case R.id.btn_regist:

				String userName= et_username.getText().toString().trim();
				String password= et_password.getText().toString().trim();
				String confirm_password= et_confirm_pwd.getText().toString().trim();

				if (TextUtils.isEmpty(userName)){
					show("用户名不能为空");
					break;
				}
				if (TextUtils.isEmpty(password)){
					show("密码不能为空");
					break;
				}
				if (!password.equals(confirm_password)){
					show("两次输入密码不一致");
					break;
				}


				show("注册成功 回调到登录页");

				HashMap<String,String> paramMap= new HashMap<>();
				paramMap.put(IntentKey.IS_NEW_USER,"true");
				paramMap.put(IntentKey.USER_NAME,userName);
				paramMap.put(IntentKey.PASSWORD,password);

				ActivityUtils.startActivity(RegistActivity.this,LoginActivity.class,paramMap);
				this.finish();
				break;

			default:
				break;
		}

	}

}
