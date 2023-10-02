function ajax(url, method) {
    const p = new Promise((resolve, reject) => {
      const xhr = new XMLHttpRequest();
      xhr.open(method, url, true)
      xhr.onreadystatechange = () => {
        if(xhr.readyState === 4){
          if((xhr.status >= 200 && xhr.status < 300) || xhr.status === 304){
            resolve(
              JSON.parse(xhr.response)
            )
          }else{
            reject(new Error('Response error'))
          }
        }
      }
      xhr.send();
    })
   return p
}
