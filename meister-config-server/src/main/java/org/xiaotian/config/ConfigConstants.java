package org.xiaotian.config;

import java.io.InputStream;

/**
 * Config的常量定义<BR>
 * 
 * @author xiaotian15
 * 
 */
public final class ConfigConstants {

	/**
	 * Class文件根路径
	 */
	public static final String CURRENT_CLASS_PATH = ClassLoader.getSystemResource("").getPath();

	/**
	 * 配置文件根目录
	 */
	public static final String CONFIG_ROOT_PATH = CURRENT_CLASS_PATH + "mconfig";

	/**
	 * 配置文件后缀
	 */
	public static final String EXT_FILE_CONFIG = "xml";

	/**
	 * castor解组config文件
	 */
	public static final String NAME_FILE_CONFIG = "config." + EXT_FILE_CONFIG;

	/**
	 * castor解组mapping文件
	 */
	public static final String NAME_FILE_MAPPING = "mapping." + EXT_FILE_CONFIG;

	/**
	 * 得到系统内部mapping文件配置文件地址(该方法兼容读取jar包内部的配置文件)
	 * 
	 * @return
	 */
	public static InputStream getRootMappingFileInputSteam() {
		return ConfigConstants.class.getResourceAsStream(NAME_FILE_MAPPING);
	}
}