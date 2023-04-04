var footdivhtml='<a class="tabbar-item" name="mainpage" id="mainpage"><span class="tabbar-icon"><i class="icon-home"></i></span><span class="tabbar-txt">首页</span></a>'+
		'<a class="tabbar-item" name="products" id="products"><span class="tabbar-icon"><i class="icon-type"></i></span><span class="tabbar-txt">商品</span></a>'+
		'<a class="tabbar-item" name="shoppingcart" id="shoppingcart"><span class="tabbar-icon"><i class="icon-shopcart"></i><span class="tabbar-dot"></span></span><span class="tabbar-txt">购物车</span></a>'+
		'<a class="tabbar-item" name="mine" id="mine"><span class="tabbar-icon"><i class="demo-icons-me"></i></span><span class="tabbar-txt">我</span></a>';

$(function() {
	$(".m-tabbar").html(footdivhtml);
	$("#"+window.location.pathname.substring(1)).addClass("tabbar-active");
	$(".tabbar-item").click(function(){
		$(this).addClass("tabbar-active").siblings().removeClass("tabbar-active");
	    window.location.href=$(this).attr("name");
	});
});