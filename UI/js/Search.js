$('#search').submit(function() {
    $.ajax({
        type: 'POST',
        url: 'http://localhost:8080/search/getBooks',
        data: $('#searchForm').serialize(),
        dataType:"json", //to parse string into JSON object,
        success: function(data){ 
            if(data){
                var len = data.length;
                var txt = "";
                if(len > 0){
                    for(var i=0;i<len;i++){
                        if(data[i].city && data[i].cStatus){
                            txt += "<tr><td>"+data[i].BOOK_NAME+"<br/>"+by+data[i].AUTHOR+"<br/>"+data[i].iSBN+"</td></tr>";
                        }
                    }
                    if(txt != ""){
                        $("#table").append(txt).removeClass("hidden");
                    }
                }
            }
        },
        error: function(jqXHR, textStatus, errorThrown){
            alert('error: ' + textStatus + ': ' + errorThrown);
        }
    });
    return false;//suppress natural form submission
});