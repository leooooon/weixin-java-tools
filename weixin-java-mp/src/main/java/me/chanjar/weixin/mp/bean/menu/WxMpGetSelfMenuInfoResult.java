package me.chanjar.weixin.mp.bean.menu;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import me.chanjar.weixin.common.util.json.WxGsonBuilder;

/**
 * <pre>
 * Created by Binary Wang on 2016-11-25.
 * </pre>
 *
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
@Data
public class WxMpGetSelfMenuInfoResult implements Serializable {
  private static final long serialVersionUID = -5612495636936835166L;

  @SerializedName("selfmenu_info")
  private WxMpSelfMenuInfo selfMenuInfo;

  @SerializedName("is_menu_open")
  private Integer isMenuOpen;

  public static WxMpGetSelfMenuInfoResult fromJson(String json) {
    return WxGsonBuilder.create().fromJson(json, WxMpGetSelfMenuInfoResult.class);
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
  }

}
