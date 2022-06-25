export class User {
    constructor(private _email:string, private _passwd:string, private _fullname?:string){
    }

    get email(){
        return this._email;
    }

    set email(value){
        this._email = value;
    }

    get passwd(){
        return this._passwd;
    }

    set passwd(value) {
        this._passwd = value;
    }

    get fullname(){
        return this._fullname;
    }

    set fullname(value) {
        this._fullname = value;
    }

    
}