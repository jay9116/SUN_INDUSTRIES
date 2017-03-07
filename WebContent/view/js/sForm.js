;(function($){
	function init(form,o){
		var name=$('.name>input',form)
			,email=$('.email>input',form)
			,submit=$('a[data-type="submit"]',form)
			,bl,vl
			
		o=$.extend({
			ownerEmail:'#'
			,mailHandlerURL:'bat/MailHandler-sub.php'
		},o)
		
		submit.click(function(){
			vl=true
			name.add(email).trigger('keyup')
			if(!$('.invalid',form).length)
				sendRQ()
			return false
		})
				
		form[form.on?'on':'bind']('keyup',function(e){
			if(e.keyCode===13){				
				name.add(email).data({wtch:true}).trigger('keyup')
				if(!$('.invalid',form).length){					
					sendRQ()
					return false
				}else{
					$('.invalid',form).focus()
				}
			}
		})
		
		name.add(email)
			.each(function(){
				var th=$(this)
					,val=th.val()
				th
					.focus(function(){
						if(th.val()==val)
							th.val('')
							,th.parents('label').removeClass('invalid')
							,th.data({wtch:false})
					})
					.blur(function(){
						if(th.val()=='')
							th.val(val)
							,th.parents('label').removeClass('invalid')
						else
							th.data({wtch:true}).trigger('keyup')
					})
			})
			[name.on?'on':'bind']('keyup',function(e){
				var th=$(this)
				if(th.data('wtch'))
					th.parents('label')[validate(th)?'removeClass':'addClass']('invalid')
			})
	
		function validate(el){
			var rx={
					"text":/^[a-zA-Z'][a-zA-Z-' ]+[a-zA-Z']?$/
					,"email":/^(("[\w-\s]+")|([\w-]+(?:\.[\w-]+)*)|("[\w-\s]+")([\w-]+(?:\.[\w-]+)*))(@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$)|(@\[?((25[0-5]\.|2[0-4][0-9]\.|1[0-9]{2}\.|[0-9]{1,2}\.))((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})\.){2}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})\]?$)/i
				}			
			return rx[el.attr('type')].test(el.val())
		}
		
		function sendRQ(){
			if(bl)
				return false
			bl=true
			$.ajax({
				type:"POST"
				,url:o.mailHandlerURL
				,data:{
					name:name.length?name.val():email.val().split('@')[0]
					,email:email.val()
					,owner_email:o.ownerEmail					
					,sitename:o.sitename||o.ownerEmail.split('@')[1]
				}
				,success:function(e){
					bl=false					
					form.trigger('reset')
					name.add(email).data({wtch:true})
				}
			})
		}		
	}	

	$.fn.sForm=function(o){
		return this.each(function(){
			init($(this),o)
		})
	}
	
})(jQuery)
$(window).load(function(){
	$('#pro_newsletter').sForm({			
		ownerEmail:'#'
		,sitename:'sitename.link'
	})
})