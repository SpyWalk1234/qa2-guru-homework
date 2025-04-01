package tests.api;

import org.openqa.selenium.By;

public class LocatorsTests {
        //1a.lv
        private final By ONE_A_LOGO = By.xpath(".//a[@class = 'main-logo']");
        private final By SEARCH_ICON = By.xpath(".//i[@class = 'main-search-submit__icon icon-svg']");
        private final By CONTACTS_1A = By.xpath(".//i[@class = 'site-top__menu-right-icon']");
        private final By SHOPPING_CARD_ICON = By.xpath(".//i[@class = 'cart-block__icon icon-svg']");
        private final By CATALOG_MENU_ICON = By.xpath(".//i[@class = 'main-menu__handle-icon icon-svg']");
        private final By SPORTS_AND_FITNESS_ICON = By.xpath(".//a[contains(@href, '/c/sports-un-fitness/2pj')]/*[local-name()='svg']");
        private final By SHOW_COOKIE_DETAILS = By.id("CybotCookiebotDialogBodyLevelDetailsButton");

        //amazon.de
        private final By SEARCH_BAR_AMAZON = By.id("twotabsearchtextbox");
        private final By CHANGE_ADDRESS = By.xpath(".//span[@class = 'a-button a-spacing-top-base a-button-primary glow-toaster-button glow-toaster-button-submit']");
        private final By ALL_CATEGORIES = By.xpath(".//i[@class = 'hm-icon nav-sprite']");
        private final By LANGUAGE_ICON = By.id("icp-nav-flyout");
        private final By SHOPPING_CART = By.id("nav-cart");
        private final By FREE_DELIVERY_PRODUCTS = By.id("CardInstanceIME2tbwcLWArkiik2PzDxw");

        //delfi.lv
        private final By DELFI_LOGO = By.id("eiXrt7zg8UN1");
        private final By NAMES = By.xpath(".//div[@class = 'header-menu__horizontal header-menu__horizontal--left']/ul/li/a");
        private final By BUSINESS_NEWS = By.xpath(".//a[contains(@href, 'https://www.delfi.lv/bizness')]");
        private final By NEWS_CATEGORIES = By.xpath(".//div[@class = 'header-menu--primary-container d-flex justify-content-between flex-nowrap align-items-center h-100 position-relative bottom-header d-none d-lg-flex']");
        private final By CONTACTS_DELFI = By.xpath(".//a[contains(@href, 'https://www.delfi.lv/kontakti')]");
        private final By LANGUAGE = By.xpath(".//div[@class = 'header-menu__horizontal header-menu__horizontal--right']/ul/li/a[@class = 'btn language-switch text-size-7 fw-bold btn-size-auto']");
        private final By SECOND_ARTICLE = By.xpath(".//div[@data-item-id = '505']/article/div[@class = 'px-2 px-md-0']");

        //sportsdirect.lv
        private final By SEARCH_BAR_SPORTSDIRECT = By.id("txtSearch");
        private final By LOGIN_ICON = By.id("divSignIn");
        private final By MENS_ITEMS = By.xpath(".//a[@class = 'Link_root__TBCX5 Button_root__iZF6l Button_secondary__MLXHt QuickLinks_button__UI_qU'][1]");
        private final By SHOP_NOW = By.xpath("//*[contains(text(), 'Shop now')]");
        private final By GIFTS_BY_BRANDS = By.xpath(".//div[@class = 'BlockHeader_text__3u7EC'][1]");
    }