function uploadFile(file) {
    var formData=new FormData();
    formData.append("file", file);

    $.ajax({
        type: "POST",
        url:"/files",
        data:formData,
        contentType:false,
        processData:false,
        success:function (data) {
            alert(data);
        },
        error:function (data) {
            alert(data.status);
        }
    })
}

// function updateProfile(name, lastname) {
//     $.ajax({
//         type: "POST",
//         url:"/users/${model.user.id}",
//         data:{
//             "name": name,
//             "lastname": lastname,
//         },
//         error: function (data) {
//             alert(data.status)
//         },
//         succes: function (data) {
//             alert("Профиль был успешно изменен")
//         }
//     })
// }